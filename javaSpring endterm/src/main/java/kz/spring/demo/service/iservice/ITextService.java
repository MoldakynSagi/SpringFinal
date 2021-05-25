package kz.spring.demo.service.iservice;


import kz.spring.demo.entity.Text;

import java.util.List;

public interface ITextService {
    Text createNew(Text text);
    Text updateText(Text text);
    void deleteTextById(Long id);
    List<Text> getTextByProductId(Long productId);
}
