package org.sanjay.lld.design.patterns.behavioral.chainofresponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);
}