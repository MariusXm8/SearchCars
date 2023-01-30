package total.progetto.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VeicoloDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-30T17:31:00.935323800+01:00[Europe/Paris]")
public class VeicoloDTO   {
  @JsonProperty("marca")
  private String marca;

  @JsonProperty("modello")
  private String modello;

  @JsonProperty("prezzo")
  private BigDecimal prezzo;

  @JsonProperty("targa")
  private String targa;

  @JsonProperty("numeroRuote")
  private BigDecimal numeroRuote;

  public VeicoloDTO marca(String marca) {
    this.marca = marca;
    return this;
  }

  /**
   * Get marca
   * @return marca
  */
  @ApiModelProperty(value = "")


  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public VeicoloDTO modello(String modello) {
    this.modello = modello;
    return this;
  }

  /**
   * Get modello
   * @return modello
  */
  @ApiModelProperty(value = "")


  public String getModello() {
    return modello;
  }

  public void setModello(String modello) {
    this.modello = modello;
  }

  public VeicoloDTO prezzo(BigDecimal prezzo) {
    this.prezzo = prezzo;
    return this;
  }

  /**
   * Get prezzo
   * @return prezzo
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPrezzo() {
    return prezzo;
  }

  public void setPrezzo(BigDecimal prezzo) {
    this.prezzo = prezzo;
  }

  public VeicoloDTO targa(String targa) {
    this.targa = targa;
    return this;
  }

  /**
   * Get targa
   * @return targa
  */
  @ApiModelProperty(value = "")


  public String getTarga() {
    return targa;
  }

  public void setTarga(String targa) {
    this.targa = targa;
  }

  public VeicoloDTO numeroRuote(BigDecimal numeroRuote) {
    this.numeroRuote = numeroRuote;
    return this;
  }

  /**
   * Get numeroRuote
   * @return numeroRuote
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getNumeroRuote() {
    return numeroRuote;
  }

  public void setNumeroRuote(BigDecimal numeroRuote) {
    this.numeroRuote = numeroRuote;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VeicoloDTO veicoloDTO = (VeicoloDTO) o;
    return Objects.equals(this.marca, veicoloDTO.marca) &&
        Objects.equals(this.modello, veicoloDTO.modello) &&
        Objects.equals(this.prezzo, veicoloDTO.prezzo) &&
        Objects.equals(this.targa, veicoloDTO.targa) &&
        Objects.equals(this.numeroRuote, veicoloDTO.numeroRuote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marca, modello, prezzo, targa, numeroRuote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeicoloDTO {\n");
    
    sb.append("    marca: ").append(toIndentedString(marca)).append("\n");
    sb.append("    modello: ").append(toIndentedString(modello)).append("\n");
    sb.append("    prezzo: ").append(toIndentedString(prezzo)).append("\n");
    sb.append("    targa: ").append(toIndentedString(targa)).append("\n");
    sb.append("    numeroRuote: ").append(toIndentedString(numeroRuote)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

