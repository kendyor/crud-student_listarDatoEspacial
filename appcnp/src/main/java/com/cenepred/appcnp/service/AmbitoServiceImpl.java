package com.cenepred.appcnp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenepred.appcnp.dto.mapper.AmbitoMapper;
import com.cenepred.appcnp.dto.mapper.StudentMapper;
import com.cenepred.appcnp.dto.model.AmbitoDTO;
import com.cenepred.appcnp.repository.AmbitoRepository;

@Service
public class AmbitoServiceImpl implements AmbitoService{
	@Autowired
	private AmbitoRepository repository;
	

	@Override
	public AmbitoDTO create(AmbitoDTO obj) {
		return null;
	}

	@Override
	public AmbitoDTO update(AmbitoDTO obj) {
		return null;
	}

	@Override
	public boolean delete(String id) {
		return false;
	}

	@Override
	public List<AmbitoDTO> list() {
		return AmbitoMapper.toAmbitoDTO(repository.findAll());
	}

	@Override
	public AmbitoDTO get(String id) {
		return null;
	}

}
