package courses.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import courses.beans.Classes;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
@Repository
public interface ClassesRepository extends JpaRepository<Classes, Long> {

}
