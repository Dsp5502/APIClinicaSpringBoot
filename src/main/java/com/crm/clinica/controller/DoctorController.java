package com.crm.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/doctors")
    public List<Doctor> getDoctors(){
        return doctorRepository.findAll();
    }

    @PostMapping("/doctors")
    public Doctor postDoctor(@RequestBody Doctor doctor){
        return doctorRepository.save(doctor);
    }

    @GetMapping("/doctors/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id){
        Doctor doctor = doctorRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("El Doctor con ese ID no existe: " + id));
        return  ResponseEntity.ok(doctor);
    }

    @PutMapping("/doctors/{id}")
    public ResponseEntity<Doctor> putDoctor(@PathVariable Long id, @RequestBody Doctor doctorRequest) {
        Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("El Doctor con ese ID noo existe: " + id));

        doctor.setName(doctorRequest.getName());
        doctor.setLastname(doctorRequest.getLastname());
        doctor.setOffice(doctorRequest.getOffice());
        doctor.setContactEmail(doctorRequest.getContactEmail());
        doctor.setSpeciality_id(doctorRequest.getSpeciality_id());

        Doctor updateDoctor = doctorRepository.save(doctor);

        return ResponseEntity.ok(updateDoctor);
    }

    @DeleteMapping("/doctors/{id}")
    public ResponseEntity<Map<String,Boolean>> deletePatient(@PathVariable Long id){
        Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("El Doctor con ese ID noo existe: " + id));
        doctorRepository.delete(doctor);
        Map<String, Boolean> response =  new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
