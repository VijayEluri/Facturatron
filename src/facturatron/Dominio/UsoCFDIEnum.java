/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturatron.Dominio;

/**
 *
 * @author octavioruizcastillo
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 02:42:25 AM CDT 
//


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import mx.bigdata.sat.cfdi.v33.schema.CUsoCFDI;

public enum UsoCFDIEnum {

    G_01("Adquisición de mercancias"),
    G_02("Devoluciones, descuentos o bonificaciones"),
    G_03("Gastos en general"),
    I_01("Construcciones"),
    I_02("Mobilario y equipo de oficina por inversiones"),
    I_03("Equipo de transporte"),
    I_04("Equipo de computo y accesorios"),
    I_05("Dados, troqueles, moldes, matrices y herramental"),
    I_06("Comunicaciones telefónicas"),
    I_07("Comunicaciones satelitales"),
    I_08("Otra maquinaria y equipo"),
    D_01("Honorarios médicos, dentales y gastos hospitalarios."),
    D_02("Gastos médicos por incapacidad o discapacidad"),
    D_03("Gastos funerales."),
    D_04("Donativos."),
    D_05("Intereses reales efectivamente pagados por créditos hipotecarios (casa habitación)."),
    D_06("Aportaciones voluntarias al SAR."),
    D_07("Primas por seguros de gastos médicos."),
    D_08("Gastos de transportación escolar obligatoria."),
    D_09("Depósitos en cuentas para el ahorro, primas que tengan como base planes de pensiones."),
    D_10("Pagos por servicios educativos (colegiaturas)"),
    P_01("Por definir");
    
    String descripcion;

    UsoCFDIEnum(String descripcion) {
        this.descripcion = descripcion;
    }
   
    public static UsoCFDIEnum getDescription(String text){
        for(UsoCFDIEnum e:UsoCFDIEnum.values()){
            if(e.name().equalsIgnoreCase(text))
                return e;
        }
        return null;
    }
    public String toString() {
        return descripcion;
    }
    
    public CUsoCFDI getSatConstant() {
        return CUsoCFDI.valueOf(name());
    }

}
