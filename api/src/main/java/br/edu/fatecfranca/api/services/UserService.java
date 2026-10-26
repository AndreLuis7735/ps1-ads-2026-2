package br.edu.fatecfranca.api.services;


import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;


import br.edu.fatecfranca.api.dtos.UserRequest;
import br.edu.fatecfranca.api.entities.User;
import br.edu.fatecfranca.api.repositories.UserRepository;


import org.springframework.security.crypto.password.PasswordEncoder;


@Service
public class UserService {


   private final UserRepository repository;
   private final PasswordEncoder passwordEncoder;


   public UserService(UserRepository repository, PasswordEncoder passwordEncoder) {
       this.repository = repository;
       this.passwordEncoder = passwordEncoder;
   }


   private void copyToEntity(UserRequest request, User user) {
       user.setFullname(request.fullname());
       user.setUsername(request.username());
       user.setEmail(request.email());
       // passwordEncoder gera o hash para a senha recebida
       user.setPassword(passwordEncoder.encode(request.password()));
       user.setIsAdmin(Boolean.TRUE.equals(request.isAdmin()));
   }


    public UserService(UserRepository repository) {
        this.repository = repository;
        this.passwordEncoder = null;
    }

    public User create(User user) {
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    public User update(User user) {
        return repository.save(user);
    }

    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}