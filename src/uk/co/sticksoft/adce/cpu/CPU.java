package uk.co.sticksoft.adce.cpu;

import java.util.HashSet;

public abstract class CPU
{
	public char[] RAM = new char[0x10000];
	public long cycleCount = 0;

	public abstract void reset();
	public abstract void execute();
	public abstract String getStatusText();
	
	public interface Observer
	{
		void onCpuExecution(CPU cpu);
	}
	
	private HashSet<Observer> observers = new HashSet<CPU.Observer>();
	public void addObserver(Observer ob)
	{
		observers.add(ob);
	}
	
	public void removeObserver(Observer ob)
	{
		observers.remove(ob);
	}
	
	private long lastNotify = 0;
	public void notifyObservers()
	{
		long time = System.currentTimeMillis();
		if (time == lastNotify)
			return;
		lastNotify = time;
		
		for (Observer o : observers)
			o.onCpuExecution(this);
	}
}
