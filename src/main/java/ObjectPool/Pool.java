package ObjectPool;

public interface Pool<T> {
	T acquire();
	void release(Funcionario funcionario);
}
