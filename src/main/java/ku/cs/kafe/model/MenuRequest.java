package ku.cs.kafe.model;

import java.util.UUID;

import lombok.Data;

@Data
public class MenuRequest {
  private String name;
  private double price;
  private UUID categoryId;
}
