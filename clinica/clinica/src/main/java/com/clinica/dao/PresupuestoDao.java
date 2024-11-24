package com.clinicamedihub.dao;

import com.clinicamedihub.domain.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresupuestoDao extends JpaRepository<Presupuesto, Long> {
}
