package com.org.common.model.dto;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public interface IPayloadWrapper<T extends IPayloadHeader, E extends IPayload> extends IDto {

//	String getPayloadType();
	@XmlAnyElement
	T getSourceSystem();
	@XmlAnyElement
	E getUser();
}
