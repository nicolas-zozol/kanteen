package io.kanteen.persistance.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Contract {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    // ? what is it ?
    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private boolean withOption;

    @ElementCollection
    @CollectionTable
    private List<ContractOption> options = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isWithOption() {
        return withOption;
    }

    public void setWithOption(boolean withOption) {
        this.withOption = withOption;
    }

    public List<ContractOption> getOptions() {
        return options;
    }

    public void setOptions(List<ContractOption> options) {
        this.options = options;
    }
}