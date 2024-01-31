/* (C) 2024 */
package com.nha.abdm.wrapper.hip.hrp.dataTransfer.responses.helpers.DataNotification.DataConsentdetail.DataCareContexts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DataCareContexts {
  public String careContextReference;
  public String patientReference;
}
