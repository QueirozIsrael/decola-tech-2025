package queiroz.israel.santander_dev_week_2025.service.imp;

import org.springframework.stereotype.Service;
import queiroz.israel.santander_dev_week_2025.domain.model.User;
import queiroz.israel.santander_dev_week_2025.domain.repository.UserRepository;
import queiroz.israel.santander_dev_week_2025.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            {
                throw new IllegalArgumentException("This User ID already exists");
            }
        }
        return userRepository.save(userToCreate);
    }
}
