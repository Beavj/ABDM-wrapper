/*
 * Swagger HIP Facade - OpenAPI 3.0
 * This is a set of interfaces based on the OpenAPI 3.0 specification for a wrapper client
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.nha.abdm.wrapper.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.nha.abdm.wrapper.client.invoker.JSON;

/**
 * Patient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-24T14:12:00.679990700+05:30[Asia/Calcutta]")
public class Patient {
  public static final String SERIALIZED_NAME_ABHA_ADDRESS = "abhaAddress";
  @SerializedName(SERIALIZED_NAME_ABHA_ADDRESS)
  private String abhaAddress;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    M("M"),
    
    F("F"),
    
    O("O"),
    
    U("U");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_PATIENT_REFERENCE = "patientReference";
  @SerializedName(SERIALIZED_NAME_PATIENT_REFERENCE)
  private String patientReference;

  public static final String SERIALIZED_NAME_PATIENT_DISPLAY = "patientDisplay";
  @SerializedName(SERIALIZED_NAME_PATIENT_DISPLAY)
  private String patientDisplay;

  public static final String SERIALIZED_NAME_PATIENT_MOBILE = "patientMobile";
  @SerializedName(SERIALIZED_NAME_PATIENT_MOBILE)
  private String patientMobile;

  public Patient() {
  }

  public Patient abhaAddress(String abhaAddress) {
    
    this.abhaAddress = abhaAddress;
    return this;
  }

   /**
   * Get abhaAddress
   * @return abhaAddress
  **/
  @javax.annotation.Nullable
  public String getAbhaAddress() {
    return abhaAddress;
  }


  public void setAbhaAddress(String abhaAddress) {
    this.abhaAddress = abhaAddress;
  }


  public Patient name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Patient gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public GenderEnum getGender() {
    return gender;
  }


  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public Patient dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public Patient patientReference(String patientReference) {
    
    this.patientReference = patientReference;
    return this;
  }

   /**
   * Get patientReference
   * @return patientReference
  **/
  @javax.annotation.Nullable
  public String getPatientReference() {
    return patientReference;
  }


  public void setPatientReference(String patientReference) {
    this.patientReference = patientReference;
  }


  public Patient patientDisplay(String patientDisplay) {
    
    this.patientDisplay = patientDisplay;
    return this;
  }

   /**
   * Get patientDisplay
   * @return patientDisplay
  **/
  @javax.annotation.Nullable
  public String getPatientDisplay() {
    return patientDisplay;
  }


  public void setPatientDisplay(String patientDisplay) {
    this.patientDisplay = patientDisplay;
  }


  public Patient patientMobile(String patientMobile) {
    
    this.patientMobile = patientMobile;
    return this;
  }

   /**
   * Get patientMobile
   * @return patientMobile
  **/
  @javax.annotation.Nullable
  public String getPatientMobile() {
    return patientMobile;
  }


  public void setPatientMobile(String patientMobile) {
    this.patientMobile = patientMobile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return Objects.equals(this.abhaAddress, patient.abhaAddress) &&
        Objects.equals(this.name, patient.name) &&
        Objects.equals(this.gender, patient.gender) &&
        Objects.equals(this.dateOfBirth, patient.dateOfBirth) &&
        Objects.equals(this.patientReference, patient.patientReference) &&
        Objects.equals(this.patientDisplay, patient.patientDisplay) &&
        Objects.equals(this.patientMobile, patient.patientMobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abhaAddress, name, gender, dateOfBirth, patientReference, patientDisplay, patientMobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient {\n");
    sb.append("    abhaAddress: ").append(toIndentedString(abhaAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    patientReference: ").append(toIndentedString(patientReference)).append("\n");
    sb.append("    patientDisplay: ").append(toIndentedString(patientDisplay)).append("\n");
    sb.append("    patientMobile: ").append(toIndentedString(patientMobile)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("abhaAddress");
    openapiFields.add("name");
    openapiFields.add("gender");
    openapiFields.add("dateOfBirth");
    openapiFields.add("patientReference");
    openapiFields.add("patientDisplay");
    openapiFields.add("patientMobile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Patient
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Patient.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Patient is not found in the empty JSON string", Patient.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Patient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Patient` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("abhaAddress") != null && !jsonObj.get("abhaAddress").isJsonNull()) && !jsonObj.get("abhaAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abhaAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abhaAddress").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("dateOfBirth") != null && !jsonObj.get("dateOfBirth").isJsonNull()) && !jsonObj.get("dateOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateOfBirth").toString()));
      }
      if ((jsonObj.get("patientReference") != null && !jsonObj.get("patientReference").isJsonNull()) && !jsonObj.get("patientReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patientReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patientReference").toString()));
      }
      if ((jsonObj.get("patientDisplay") != null && !jsonObj.get("patientDisplay").isJsonNull()) && !jsonObj.get("patientDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patientDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patientDisplay").toString()));
      }
      if ((jsonObj.get("patientMobile") != null && !jsonObj.get("patientMobile").isJsonNull()) && !jsonObj.get("patientMobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patientMobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patientMobile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Patient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Patient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Patient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Patient.class));

       return (TypeAdapter<T>) new TypeAdapter<Patient>() {
           @Override
           public void write(JsonWriter out, Patient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Patient read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Patient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Patient
  * @throws IOException if the JSON string is invalid with respect to Patient
  */
  public static Patient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Patient.class);
  }

 /**
  * Convert an instance of Patient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

