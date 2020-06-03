package com.carloncho.code.number;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

public class CacheEventLogger implements CacheEventListener<Object, Object> {

	@Override
	public void onEvent(CacheEvent<? extends Object, ? extends Object> cacheEvent) {
		//log.info(/* message */, cacheEvent.getKey(), cacheEvent.getOldValue(), cacheEvent.getNewValue());
		System.out.println("cacheEvent.getKey()= " + cacheEvent.getKey()+"cacheEvent.getOldValue()=" +cacheEvent.getOldValue() + "cacheEvent.getNewValue()=" + cacheEvent.getNewValue());
	}

}
