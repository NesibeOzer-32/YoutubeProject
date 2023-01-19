package YoutubeProject.pages;

import YoutubeProject.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class YoutubeMusicPageFunctionPage {
    public YoutubeMusicPageFunctionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
