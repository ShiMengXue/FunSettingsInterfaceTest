package com.zhengjin.apis.testutils;

import org.apache.jmeter.protocol.java.sampler.JUnitSampler;


public final class JmeterUtils {
	
	public static String getUserDefinedVarFromJmeterEnv(JUnitSampler sampler, String key) {
		return sampler.getThreadContext().getVariables().get(key);
	} 
}
