/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetos.ci.clinica.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author gmatuella
 */
@Entity
@Table(name = "secretaria")
public class Secretaria extends Usuario implements Serializable {

}