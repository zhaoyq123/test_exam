import java.util.ArrayList;
import java.util.List;

public class Schedule {

	public List<Double> FCFS(List<Work> works) {
		double avgCircleTime = 0;
		double avgCircleTimeWP = 0;
		List<Double> lst = new ArrayList<Double>();
		for (int i = 0; i < works.size(); i++) {
			// works.get(i).getArrivalTime();
			// works.get(i).getServiceTime();
			if (i != 0) {
				works.get(i).setBeginTime(works.get(i - 1).getEndTime());
			} else {
				works.get(i).setBeginTime(works.get(i).getArrivalTime());
			}
			works.get(i)
					.setEndTime(
							works.get(i).getBeginTime()
									+ works.get(i).getServiceTime());
			avgCircleTime += works.get(i).getCircleTime();
			avgCircleTimeWP += works.get(i).getCircleWPTime();
		}
		avgCircleTime /= works.size();
		avgCircleTimeWP /= works.size();
		lst.add(avgCircleTime);
		lst.add(avgCircleTimeWP);
		return lst;
	}

	/**
	 * �ĺ�Ķ���ҵ���ȵ����㷨
	 * 
	 * @param works
	 * @return
	 */
	public List<Double> SJF(List<Work> works) {
		List<Double> lst = new ArrayList<Double>();
		double avgCircleTime = 0;
		double avgCircleTimeWP = 0;
		List<Work> ins = new ArrayList<Work>();
		int i = 0;
		int counter = 0; // �������ҵ�ļ�����
		// �ж��Ƿ��Ѿ������е���ҵ���������
		while (counter < works.size()) {
			// �ҵ�����δִ�У��ҵ���ʱ��С��i����ҵ
			for (int j = 0; j < works.size(); j++) {
				if (works.get(j).isIn())
					continue;
				if (works.get(j).getArrivalTime() <= i) {
					ins.add(works.get(j));
				}
			}
			if (ins.isEmpty()) {
				i++;
			} else {
				ins = sortByServiceTime(ins);
				// ����ǰ�ѵ������ҵ�У�����ʱ����̵���ҵ���뵽CPUִ��
				Work now = ins.get(0);
				now.setBeginTime(i);
				now.setEndTime(now.getBeginTime() + now.getServiceTime());
				now.setIn(); // �����ҵ�ѵ���
				counter++;
				i = now.getEndTime(); // ���µ�ǰʱ��
				ins.clear(); // �����ʱ����ins
			}

		}
		for (int m = 0; m < works.size(); m++) {
			avgCircleTime += works.get(m).getCircleTime();
			avgCircleTimeWP += works.get(m).getCircleWPTime();
		}
		avgCircleTime = avgCircleTime / works.size();
		avgCircleTimeWP = avgCircleTimeWP / works.size();
		lst.add(avgCircleTime);
		lst.add(avgCircleTimeWP);
		return lst;
	}

	/**
	 * �Լ��뵽ϵͳ�е���ҵ���ݷ���ʱ����ٽ�������<BR>
	 * Ȼ��ֱ�ӷ���
	 * 
	 * @param ins
	 * @return ins
	 */
	public static List<Work> sortByServiceTime(List<Work> ins) {
		for (int i = 0; i < ins.size(); i++) {
			for (int j = i + 1; j < ins.size(); j++) {
				Work aw = ins.get(i);
				int a = aw.getServiceTime();
				Work bw = ins.get(j);
				int b = bw.getServiceTime();
				if (a > b) {
					ins.remove(j);
					ins.add(i, bw);
				}
			}
		}
		return ins;
	}
}