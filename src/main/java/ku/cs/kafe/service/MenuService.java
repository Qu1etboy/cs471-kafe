package ku.cs.kafe.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ku.cs.kafe.entity.Category;
import ku.cs.kafe.entity.Menu;
import ku.cs.kafe.model.MenuRequest;
import ku.cs.kafe.repository.CategoryRepository;
import ku.cs.kafe.repository.MenuRepository;

@Service
public class MenuService {

  @Autowired
  private MenuRepository menuRepository;

  @Autowired
  private CategoryRepository categoryRepository;

  @Autowired
  private ModelMapper modelMapper;

  public List<Menu> getAllMenus() {
    return menuRepository.findAll();
  }

  public void createMenu(MenuRequest menu) {
    Menu record = modelMapper.map(menu, Menu.class);
    Category category = categoryRepository.findById(menu.getCategoryId()).get();
    record.setCategory(category);

    menuRepository.save(record);
  }
}
