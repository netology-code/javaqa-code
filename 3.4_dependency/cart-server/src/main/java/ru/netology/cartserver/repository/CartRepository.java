package ru.netology.cartserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.cartserver.domain.PurchaseItem;

public interface CartRepository extends JpaRepository<PurchaseItem, Integer> {}
