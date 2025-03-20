package kz.seisen.sauda.repositories;

import kz.seisen.sauda.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
