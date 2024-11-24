package com.clinicamedihub.service.impl;

import com.clinicamedihub.dao.PresupuestoDao;
import com.clinicamedihub.domain.Presupuesto;
import com.clinicamedihub.service.PresupuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresupuestoServiceImpl implements PresupuestoService {

    @Autowired
    private PresupuestoDao presupuestoDao;

    @Override
    public void guardarPresupuesto(Presupuesto presupuesto) {
        presupuestoDao.save(presupuesto);
    }
}
