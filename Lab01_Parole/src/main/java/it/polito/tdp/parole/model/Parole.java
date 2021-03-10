package it.polito.tdp.parole.model;

import java.util.*;

public class Parole  {
	
	private List<String> parole; 
	
	
		
	public Parole() {
		this.parole=new ArrayList<>();
	}
	
	public Parole(List<String>e){
		this.parole=new ArrayList<>(e);
	}
	
	public void addParola(String p) {
		this.parole.add(p);
	}
	
	public List<String> getElenco(){
		List<String> paroleOrd = new ArrayList<>(parole);
		
		Collections.sort(paroleOrd);
		
		return paroleOrd;
	}
	
	
	public void cancellaParola(String parola) {
		parole.remove(parole.indexOf(parola));
	}
	
	public void reset() {
		this.parole.clear();
	}
	
	@Override 
	public String toString() {
		String ritorno=""; 
		for(String p: parole)
			ritorno+=p+"\n";
		return ritorno;
	}






}
