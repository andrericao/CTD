from selenium import webdriver
from selenium.webdriver.chrome.options import Options

caps = webdriver.DesiredCapabilities.CHROME.copy() 

caps['acceptInsecureCerts'] = True

driver = webdriver.Chrome(desired_capabilities=caps)