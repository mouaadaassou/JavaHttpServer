package io.nodom.SpringIoC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomedBeanPostProcessor implements BeanFactoryPostProcessor {

	static {
		System.out.println("CustomedBeanPostProcessor");
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In After bean Initialization method. Bean name is " + beanName);
		if (bean instanceof WeatherServiceImpl)
			System.out.println("Bean please");

		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In Before bean Initialization method. Beanname is " + beanName);
		return bean;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("*********************************");
	}
}

// public Object postProcessBeforInitialization(Object bean, String beanName) {
// System.out.println("***************** Post Process Befor Initializations
// ********************");
// System.out.println("*******************************************************");
// System.out.println("*******************************************************");
// System.out.println("*******************************************************");
// System.out.println("***************** bean name : " + beanName + "
// ***********************");
// System.out.println("*******************************************************");
// System.out.println("*******************************************************");
// System.out.println("*******************************************************");
// return bean;
// }
//
// public Object postProcessAfterInitialization(Object bean, String beanName) {
// System.out.println("***************** Post Process After Initializations
// ********************");
// System.out.println("*******************************************************");
// System.out.println("*******************************************************");
// System.out.println("*******************************************************");
// System.out.println("***************** bean name : " + beanName + "
// ***********************");
// System.out.println("*******************************************************");
// System.out.println("*******************************************************");
// System.out.println("*******************************************************");
// return bean;
// }
