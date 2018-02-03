package bluetooth.advertisements.dao;

import bluetooth.advertisements.dto.BluetoothAdvertisementDto;
import java.util.List;

/**
 * A collection of methods to access bluetooth advertisements
 * Create by Mark West on 2/3/2017
 */
public interface IBluetoothDao {

    /**
     * Accept filter text, and return a collection of bluetooth advertisements that contain that filter.
     * @param filter The filter we want to use
     * @return A list of bluetooth advertisements that match the given filter
     */
    public List<BluetoothAdvertisementDto> getBluetoothAdvertisements(String filter);
}
