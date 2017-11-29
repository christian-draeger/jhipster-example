import { AppPage } from './app.po';

describe('frontend App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should display panel headline', () => {
    page.navigateTo();
    expect(page.getPanelHeadlineText()).toEqual('My Tasks');
  });
});
