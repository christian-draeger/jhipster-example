import { browser, by, element } from 'protractor';

export class AppPage {
  navigateTo() {
    return browser.get('/');
  }

  getParagraphText() {
    return element(by.css('app-root h1')).getText();
  }

    getPanelHeadlineText() {
        return element(by.css('.panel-heading h3')).getText();
    }
}
