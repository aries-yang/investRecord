public class InvestRecord {

	private int pageSize = 10;

	//TODO 可以随便定义你需要的字段


	/**
	 * 构造函数接收两个参数，分别为：计息中m条，已完结n
	 */
	public InvestRecord(int settled, int cleared) {
		//TODO 
	}

	/**
	 * 进入页面
	 */
	public void entrance() {
		//TODO 	业务逻辑处理，要在控制台输出如下格式的内容：

		/**
		 * 开始 进入页面 操作-----------------------------------------
		 * 请求(xxx状态，第xx页数据);
		 * 响应:{
		 *  results:[
		 *  "xx状态第xx条",
		 *  "xx状态第xx条"
		 *  ],
		 *  totalSize: xx
		 * }
		 * 界面输出：[
		 *  "xx状态第xx条",
		 *  "xx状态第xx条",
		 *  "xx状态第xx条",
		 *  "xx状态第xx条",
		 *  "xx状态第xx条"
		 * ]
		 * 是否显示“查看已完结”：xx
		 * 是否显示“已全部加载”：xx
		 */
	}

	/**
	 * 上拉加载更多
	 */
	public void pullUp() {
		//TODO 	业务逻辑处理，要在控制台输出如下格式的内容：

		/**
		 * 开始 上拉加载更多 操作-----------------------------------------
		 * 请求(xxx状态，第xx页数据);
		 * 响应:{
		 *  results:[
		 *  "xx状态第xx条",
		 *  "xx状态第xx条"
		 *  ],
		 *  totalSize: xx
		 * }
		 * 界面输出：[
		 *  "xx状态第xx条",
		 *  "xx状态第xx条",
		 *  "xx状态第xx条",
		 *  "xx状态第xx条",
		 *  "xx状态第xx条"
		 * ]
		 * 是否显示“查看已完结”：xx
		 * 是否显示“已全部加载”：xx
		 */
	}

	/**
	 * 下拉刷新
	 */
	public void pullDown() {
		//TODO 	业务逻辑处理，要在控制台输出如下格式的内容：

		/**
		 * 开始 下拉刷新 操作-----------------------------------------
		 * 请求(xxx状态，第xx页数据);
		 * 响应:{
		 *  results:[
		 *  "xx状态第xx条",
		 *  "xx状态第xx条"
		 *  ],
		 *  totalSize: xx
		 * }
		 * 界面输出：[
		 *  "xx状态第xx条",
		 *  "xx状态第xx条",
		 *  "xx状态第xx条",
		 *  "xx状态第xx条",
		 *  "xx状态第xx条"
		 * ]
		 * 是否显示“查看已完结”：xx
		 * 是否显示“已全部加载”：xx
		 */
	}

	/**
	 * TODO 可以随便定义你需要的函数
	 */



	/**
	 * 测试流程
	 */
	public static void main(String[] args) {

		//按测试用例参数来初始化
		InvestRecord ir = new InvestRecord(5, 10);

		//按测试用例要求来组合操作步骤
		ir.entrance();
		ir.pullUp();
		ir.pullUp();
		ir.pullUp();
		ir.pullDown();
		ir.pullDown();

	}
}