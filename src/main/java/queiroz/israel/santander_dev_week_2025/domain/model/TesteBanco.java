package queiroz.israel.santander_dev_week_2025.domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import queiroz.israel.santander_dev_week_2025.domain.repository.UserRepository;

@Component
public class TesteBanco implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User usuario = new User();
        usuario.setName("Teste");
        userRepository.save(usuario);
    }
}
