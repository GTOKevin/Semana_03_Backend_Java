package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public abstract List<Medicamento> listaMedicamento();
	public abstract Medicamento insertarActualizarMedicamento(Medicamento obj);
	public abstract Optional<Medicamento> buscaPorIdM(int idMedicamento);
	public abstract void eliminaPorIdM(int idMedicamento);
	
}
