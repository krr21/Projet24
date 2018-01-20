package overpass;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

public class JaxbConverter<T> extends AbstractHttpMessageConverter<T> {

	  private final Class<T> clazz;
	  private final Unmarshaller unmarshaller;
	  private final Marshaller marshaller;

	  public JaxbConverter(Class<T> clazz, Class<?> factory) {
	    super(MediaType.TEXT_XML, MediaType.APPLICATION_XML, new MediaType("application", "*+xml"));
	    this.clazz = clazz;
	    try {
	      JAXBContext context = JAXBContext.newInstance(factory);
	      unmarshaller = context.createUnmarshaller();
	      marshaller = context.createMarshaller();
	    } catch (JAXBException exception) {
	      throw new IllegalArgumentException(clazz.getName(), exception);
	    }
	  }

	  protected boolean supports(Class<?> clazz) {
	    return clazz.isAssignableFrom(this.clazz);
	  }

	  @Override
	  protected T readInternal(Class<? extends T> clazz, HttpInputMessage inputMessage)
	      throws IOException, HttpMessageNotReadableException {
	    try {
	      return (T) unmarshaller.unmarshal(inputMessage.getBody());
	    } catch (JAXBException exception) {
	      throw new HttpMessageNotReadableException("unmarshall error", exception);
	    }
	  }

	  @Override
	  protected void writeInternal(T t, HttpOutputMessage outputMessage)
	      throws IOException, HttpMessageNotWritableException {
	    try {
	      marshaller.marshal(t, outputMessage.getBody());
	    } catch (JAXBException exception) {
	      throw new HttpMessageNotWritableException("marshall error", exception);
	    }
	  }

	}

