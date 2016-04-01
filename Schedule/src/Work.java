public class Work {
	/** ��ҵ��*/
	private String name;
	/** ��ҵ����ʱ��*/
	private int arrivalTime;
	/** ��ҵ����ʱ��*/
	private int serviceTime;
	/** ��ʼִ��ʱ��*/
	private int beginTime;
	/** ���ʱ��*/
	private int endTime;
	/** ��ҵ�Ƿ����ϵͳ*/
	private boolean in=false;
	/**
	 * ��ҵ�ѵ���
	 */
	public void setIn(){
		this.in=true;
	}
	/**
	 * �ж���ҵ�Ƿ��ѵ���ϵͳ
	 * @return
	 */
	public boolean isIn(){
		return this.in;
	}
	/**
	 * Constructor
	 * @param name
	 * @param t1
	 * @param t2
	 */
	public Work(String name,int t1,int t2){
		this.name=name;
		this.arrivalTime=t1;
		this.serviceTime=t2;
	}
	/**
	 * ���ÿ�ʼִ��ʱ��
	 * @param t
	 */
	public void setBeginTime(int t){
		this.beginTime=t;
	}
	/**
	 * ��ȡ��ʼʱ��
	 * @return
	 */
	public int getBeginTime(){
		return this.beginTime;
	}
	/**
	 * �������ʱ��
	 * @param t
	 */
	public void setEndTime(int t){
		this.endTime=t;
	}
	/**
	 * ��ȡ����ʱ��
	 * @return
	 */
	public int getEndTime(){
		return this.endTime;
	}
	/**
	 * ���㡰��תʱ�䡱=���ʱ��-����ʱ��
	 * @return int
	 */
	public int getCircleTime(){
		return this.endTime-this.arrivalTime;
	}
	/**
	 * ���㡰��Ȩ��תʱ�䡱=��תʱ��/����ʱ��
	 * @return
	 */
	public double getCircleWPTime(){
		
		
		return ((double)getCircleTime())/this.serviceTime;
	}
	/**
	 * ����"��Ӧ��"=���ȴ�ʱ��+Ҫ�����ʱ�䣩/Ҫ�����ʱ��=��Ӧʱ��/Ҫ�����ʱ��
	 * @return
	 */
	public int getPriority(){
		//TODO
		
		return 0;
	}
	/**
	 *��ȡ����ʱ��
	 * @return
	 */
	public int getArrivalTime(){
		return this.arrivalTime;
	}
	/**
	 * ��ȡ����ʱ��
	 * @return
	 */
	public int getServiceTime(){
		return this.serviceTime;
	}
}