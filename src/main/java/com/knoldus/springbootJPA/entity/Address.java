package com.knoldus.springbootJPA.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name="name",
                column=@Column(name="city")
        ),
        @AttributeOverride(
                name="street",
                column = @Column(name="street")
        ),
        @AttributeOverride(
                name="pin",
                column=@Column(name="pin")
        )
})
@Builder
public class Address {
    private String city;
    private String street;
    private String pin;
}
