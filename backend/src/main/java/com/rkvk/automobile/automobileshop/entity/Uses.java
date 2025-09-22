package com.rkvk.automobile.automobileshop.entity;
import com.rkvk.automobile.automobileshop.entity.id.UsesId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "uses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Uses {

    @EmbeddedId
    private UsesId id;

    @ManyToOne
    @MapsId("invoiceId")
    @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id")
    private Invoice invoice;

    @ManyToOne
    @MapsId("partId")
    @JoinColumn(name = "part_id", referencedColumnName = "part_id")
    private Inventory part;

    @Column(name = "count")
    private Integer count;
}
