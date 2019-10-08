package com.cenepred.appcnp.dto.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cenepred.appcnp.dto.model.AmbitoDTO;
import com.cenepred.appcnp.model.Ambito;

public class AmbitoMapper {
	public static AmbitoDTO toAmbitoDTO(Ambito obj) {
		AmbitoDTO dto = new AmbitoDTO();
		dto.setId(obj.getId());
		dto.setNombre(obj.getNombre());
		dto.setDescripcion(obj.getDescripcion());
		dto.setUbigeo(obj.getUbigeo());
		dto.setShape(obj.getShape());
		
		return dto;
	}
	public static Ambito toAmbito(AmbitoDTO dto) {
		Ambito obj = new Ambito();
		obj.setId(dto.getId());
		obj.setNombre(dto.getNombre());
		obj.setDescripcion(dto.getDescripcion());
		obj.setUbigeo(dto.getUbigeo());
		obj.setShape(dto.getShape());
		
		return obj;
	}
	
	public static List<AmbitoDTO> toAmbitoDTO(List<Ambito> list) {
		AmbitoDTO dto;
		List<AmbitoDTO> listDTO = new ArrayList<>();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Ambito obj = (Ambito) iterator.next();
			dto = new AmbitoDTO();
			dto.setId(obj.getId());
			dto.setNombre(obj.getNombre());
			dto.setDescripcion(obj.getDescripcion());
			dto.setUbigeo(obj.getUbigeo());
			dto.setShape(obj.getShape());
			listDTO.add(dto);
		}
		
		
		return listDTO;
	}
}
