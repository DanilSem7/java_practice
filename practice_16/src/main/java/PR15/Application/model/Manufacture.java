package PR15.Application.model;

import PR15.Application.model.Phone;
import com.sun.istack.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "manufactures")
public class Manufacture implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "address")
    @NotNull
    private String address;


    @ManyToOne(fetch = FetchType.LAZY)
    private Phone phone;

    public Manufacture() {
    }

    public Manufacture(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setUser(Phone phone) {
        this.phone = phone;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Manufacture #" + id + " " + name + " " + address;
    }
}
