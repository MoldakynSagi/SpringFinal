package kz.spring.demo.service;


import kz.spring.demo.entity.Text;
import kz.spring.demo.repository.TextRepository;
import kz.spring.demo.service.iservice.ITextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextService implements ITextService {
    @Autowired
    private TextRepository textRepository;

    @Override
    public Text createNew(Text text) {
        return textRepository.saveAndFlush(text);
    }

    @Override
    public Text updateText(Text text) {
        return textRepository.saveAndFlush(text);
    }

    @Override
    public void deleteTextById(Long id) {
        textRepository.deleteById(id);
    }

    @Override
    public List<Text> getTextByProductId(Long productId) {
        return textRepository.getTextByMusicId(productId);
    }
}
