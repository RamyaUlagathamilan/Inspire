from selenium import webdriver
from selenium.webdriver.common.by import By
import time


try:
    driver=webdriver.Chrome()
    driver.implicitly_wait(10)
    driver.maximize_window()
    driver.get("http://redacted.inspire.com/")
    driver.find_element(By.ID, "logIn").click()
    driver.find_element(By.ID, "email").send_keys("ramyaambika29@gmail.com")
    driver.find_element(By.ID, "pw").send_keys("InspireTest")
    driver.find_element(By.ID, "login_submit").click()
    print("Logged into application")
    time.sleep(10)
    driver.find_element(By.ID, "startPostButton").click()
    print("Create post button clicked")
    driver.find_element(By.XPATH,"//div[@class='create-post-modal cmw-inner']").is_displayed()
    print("Pop up is Displayed")
    time.sleep(2)
    driver.find_element(By.XPATH,"//*[@id='toggle_topic_list']").click()
    driver.find_element(By.XPATH, "//div[text()=' Drug allergies ']").click()
    print("Topic is choosed")
    driver.find_element(By.XPATH, "//input[@id='post-title-textbox']").send_keys("QA post from python")
    print("Title is entered")
    driver.find_element(By.XPATH, "//*[@role='textbox']").send_keys("QA post from python")
    print("Body content is entered")
    driver.find_element(By.XPATH, "//*[@id='dropdown_wrapper']").click()
    
    elements=driver.find_elements(By.XPATH, "//*[@id='dropdown_item']//div")
    for e in elements:
        print(e.text)
        if e.text == "Inspire Friends":
            e.click()
            break
    print("Privacy option is set as Inspire Friends")
    driver.find_element(By.XPATH, "//*[@id='submit-post-button']").click()
    print("Post is Submitted")
    time.sleep(5)
    element=driver.find_element(By.XPATH, "(//h1[@class='pb-disc-title'])[1]//a")
    if element.text == "QA post from python":
        print("Post is verified")
    else:
        print("Post is not verified")

except:
    print("Error occurred")
    
finally:
    driver.quit()
    

