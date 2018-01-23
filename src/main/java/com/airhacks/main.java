package com.airhacks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main {

	private static final Logger LOG = LoggerFactory.getLogger(main.class);
	
	public static void main(String[] args) {
		/*
		LOG.trace("This will be printed on trace");
        LOG.debug("This will be printed on debug");
        LOG.info("This will be printed on info");
        LOG.warn("This will be printed on warn");
        LOG.error("This will be printed on error");
		*/
		
		try {
			if(0==0){
				throw new Exception("XXXXXXXXXXXXXXX");
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOG.error(e.toString());
		}
		
	}

}
