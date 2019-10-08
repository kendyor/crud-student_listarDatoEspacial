package com.cenepred.appcnp.service;

import java.util.List;

import com.cenepred.appcnp.dto.model.AmbitoDTO;

public interface AmbitoService {
	public AmbitoDTO create(AmbitoDTO obj);
	public AmbitoDTO update(AmbitoDTO obj);
	public boolean delete(String id);
	public List<AmbitoDTO> list();
	public AmbitoDTO get(String id);
}
