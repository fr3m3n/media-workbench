package com.dentalcura.bookingapp.dto;

import com.dentalcura.bookingapp.dto.appointment.CreateAppointmentRequest;
import com.dentalcura.bookingapp.dto.appointment.AppointmentResponse;
import com.dentalcura.bookingapp.dto.appointment.UpdateAppointmentRequest;
import com.dentalcura.bookingapp.model.Address;
import com.dentalcura.bookingapp.model.Appointment;
import com.dentalcura.bookingapp.model.Dentist;
import com.dentalcura.bookingapp.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class AppointmentMapper {

    // Response DTO for @GetMapping (Retrieving a Appointment)
    public static AppointmentResponse appointmentToDtoResponse(Appointment appointment) {
        return new AppointmentResponse(
                appointment.date(),
                appointment.patient().name() + appointment.patient().surname(),
                appointment.dentist().name() + appointment.dentist().surname()
        );
    }
    // Response DTO for @GetMapping (Retrieving a List<Appointment>)
    public static List<AppointmentResponse> appointmentsToDtoResponse(List<Appointment> appointments) {
        List<AppointmentResponse> appointmentResponses = new ArrayList<>();
        appointments.forEach(appointment -> appointmentResponses.add(appointmentToDtoResponse(appointment)));

        return appointmentResponses;
    }

    // Request DTO for @PostMapping (Creating a Appointment)
    public static Appointment dtoPostRequestToAppointment(CreateAppointmentRequest createAppointmentRequest) {
        return new Appointment(
                createAppointmentRequest.id(),
                createAppointmentRequest.date(),
                new Patient(
                        createAppointmentRequest.patient().id(),
                        createAppointmentRequest.patient().name(),
                        createAppointmentRequest.patient().surname(),
                        createAppointmentRequest.patient().niNumber(),
                        createAppointmentRequest.patient().registrationDate(),
                        new Address(
                                createAppointmentRequest.patient().address().id(),
                                createAppointmentRequest.patient().address().streetName(),
                                createAppointmentRequest.patient().address().streetNumber(),
                                createAppointmentRequest.patient().address().floor(),
                                createAppointmentRequest.patient().address().department()
                                )
                ),
                new Dentist(
                        createAppointmentRequest.dentist().id(),
                        createAppointmentRequest.dentist().name(),
                        createAppointmentRequest.dentist().surname(),
                        createAppointmentRequest.dentist().licenseNumber()
                        )
        );
    }

    // Request DTO for @PutMapping (Updating a Appointment)
    public static Appointment dtoPutRequestToAppointment(UpdateAppointmentRequest updateAppointmentRequest) {
        return new Appointment(
                updateAppointmentRequest.id(),
                updateAppointmentRequest.date(),
                new Patient(
                        updateAppointmentRequest.patient().id(),
                        updateAppointmentRequest.patient().name(),
                        updateAppointmentRequest.patient().surname(),
                        updateAppointmentRequest.patient().niNumber(),
                        updateAppointmentRequest.patient().registrationDate(),
                        new Address(
                                updateAppointmentRequest.patient().address().id(),
                                updateAppointmentRequest.patient().address().streetName(),
                                updateAppointmentRequest.patient().address().streetNumber(),
                                updateAppointmentRequest.patient().address().floor(),
                                updateAppointmentRequest.patient().address().department()
                        )
                ),
                new Dentist(
                        updateAppointmentRequest.dentist().id(),
                        updateAppointmentRequest.dentist().name(),
                        updateAppointmentRequest.dentist().surname(),
                        updateAppointmentRequest.dentist().licenseNumber()
                )
        );
    }

}

