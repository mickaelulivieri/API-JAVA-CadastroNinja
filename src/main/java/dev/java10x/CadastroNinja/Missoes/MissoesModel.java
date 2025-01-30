package dev.java10x.CadastroNinja.Missoes;

import dev.java10x.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_Missoes")
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome_Missao")
    private String nomeMissao;

    @Column(name = "Dificuldade_missao")
    private String dificuldade;

    @Column(name = "Chave_estrangeira")
    @OneToMany (mappedBy = "missoes")
    private NinjaModel ninja;

}
