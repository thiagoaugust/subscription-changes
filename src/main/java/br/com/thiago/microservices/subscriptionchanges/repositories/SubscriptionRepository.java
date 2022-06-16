package br.com.thiago.microservices.subscriptionchanges.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.thiago.microservices.subscriptionchanges.models.Subscription;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long>{

}
