package com.clinica.controller;

import com.clinica.domain.Maternidad;
import com.clinica.service.MaternidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/maternidad")
public class MaternidadController {

    @Autowired
    private MaternidadService maternidadService;

    @GetMapping("/listar")
    public String listarMaternidad(Model model) {
        model.addAttribute("maternidad", maternidadService.listarMaternidades());
        return "maternidad/listar";
    }

    @GetMapping("/presupuesto")
    public String mostrarFormularioPresupuesto(Model model) {
        model.addAttribute("maternidad", new Maternidad());
        return "maternidad/presupuesto";
    }

    @PostMapping("/presupuesto/enviar")
    public String enviarPresupuesto(@ModelAttribute Maternidad maternidad, Model model) {
        maternidadService.guardarMaternidad(maternidad);
        model.addAttribute("mensaje", "El presupuesto ha sido enviado exitosamente.");
        return "maternidad/confirmacion";
    }

    @GetMapping("/maternidad/confirmacion")
    public String mostrarConfirmacion() {
        return "maternidad/confirmacion";
    }

}
