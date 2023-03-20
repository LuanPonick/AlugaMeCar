package com.AlugaMeCar.AlugaMeCar.repositories;

import com.AlugaMeCar.AlugaMeCar.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Long> {
}
