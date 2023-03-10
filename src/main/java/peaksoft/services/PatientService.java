package peaksoft.services;

import org.springframework.stereotype.Service;
import peaksoft.models.Patient;

import java.util.List;


@Service
public interface PatientService {
    List<Patient> getAllPatient();
    void savePatient(Patient patient);
}
