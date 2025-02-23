package queiroz.israel.santander_dev_week_2025.service;

import queiroz.israel.santander_dev_week_2025.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
