package br.edu.fatecfranca.api.dtos;


import java.time.LocalDate;


public record UserRequest(
   String fullname,
   String username,
   String email,
   String password,
   Boolean isAdmin,
   Long customerId
) {}

