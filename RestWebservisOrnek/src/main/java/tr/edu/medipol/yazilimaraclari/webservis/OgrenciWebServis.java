package tr.edu.medipol.yazilimaraclari.webservis;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServis {

	public record Ogrenci(String adSoyad,String numara) {}
	
	private static final List<Ogrenci> OGRENCI_LISTESI=new ArrayList<>();
	static {
		OGRENCI_LISTESI.add(new Ogrenci("ALİ VELİ","1"));
		OGRENCI_LISTESI.add(new Ogrenci("AYSE FATMA","2"));
		OGRENCI_LISTESI.add(new Ogrenci("ÖMER ALİ","3"));
	}
	
	@GetMapping("/")
	public List<Ogrenci> listele(){
	return OGRENCI_LISTESI;
	}
	
	
}
