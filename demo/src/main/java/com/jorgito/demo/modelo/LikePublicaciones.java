package com.jorgito.demo.modelo;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "likePublicaciones")
public class LikePublicaciones {
    
    @Id
    @GeneratedValue
    long id;

    @ManyToOne
    Usuario dadorLike;

    @ManyToOne
    Publicacion likeado;
    
}
